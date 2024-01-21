package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Onlyfans: ImageVector
    get() {
        if (_onlyfans != null) {
            return _onlyfans!!
        }
        _onlyfans = Builder(name = "Onlyfans", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.003f)
                horizontalLineToRelative(-4.015f)
                curveToRelative(-3.45f, 0.0f, -5.3f, 0.197f, -6.748f, 1.957f)
                arcToRelative(7.996f, 7.996f, 0.0f, true, false, 2.103f, 9.211f)
                curveToRelative(3.182f, -0.231f, 5.39f, -2.134f, 6.085f, -5.173f)
                curveToRelative(0.0f, 0.0f, -2.399f, 0.585f, -4.43f, 0.0f)
                curveToRelative(4.018f, -0.777f, 6.333f, -3.037f, 7.005f, -5.995f)
                close()
                moveTo(5.61f, 11.999f)
                arcTo(2.391f, 2.391f, 0.0f, false, true, 9.28f, 9.97f)
                arcToRelative(2.966f, 2.966f, 0.0f, false, true, 2.998f, -2.528f)
                horizontalLineToRelative(0.008f)
                curveToRelative(-0.92f, 1.778f, -1.407f, 3.352f, -1.998f, 5.263f)
                arcTo(2.392f, 2.392f, 0.0f, false, true, 5.61f, 12.0f)
                close()
                moveTo(7.996f, 4.003f)
                arcToRelative(7.996f, 7.996f, 0.0f, true, false, 7.996f, 7.996f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, false, -7.996f, -7.996f)
                close()
                moveTo(7.996f, 14.397f)
                arcTo(2.399f, 2.399f, 0.0f, true, true, 10.395f, 12.0f)
                arcToRelative(2.396f, 2.396f, 0.0f, false, true, -2.399f, 2.398f)
                close()
            }
        }
        .build()
        return _onlyfans!!
    }

private var _onlyfans: ImageVector? = null
