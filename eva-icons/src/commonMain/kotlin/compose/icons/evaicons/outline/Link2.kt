package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Link2: ImageVector
    get() {
        if (_link2 != null) {
            return _link2!!
        }
        _link2 = Builder(name = "Link2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.29f, 9.29f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.28f, 17.4f)
                lineTo(11.0f, 18.67f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -5.58f, 0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.27f, -5.93f)
                lineToRelative(1.42f, -1.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineTo(3.88f, 11.57f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, -0.67f, 8.07f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, 9.07f, 0.6f)
                lineToRelative(1.42f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.66f, 3.22f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, -8.13f, 0.68f)
                lineTo(10.45f, 5.0f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.17f, 1.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineTo(13.0f, 5.3f)
                arcToRelative(4.17f, 4.17f, 0.0f, false, true, 5.57f, -0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.27f, 5.95f)
                lineToRelative(-1.42f, 1.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineToRelative(1.42f, -1.42f)
                arcTo(6.06f, 6.06f, 0.0f, false, false, 19.66f, 3.22f)
                close()
            }
        }
        .build()
        return _link2!!
    }

private var _link2: ImageVector? = null
