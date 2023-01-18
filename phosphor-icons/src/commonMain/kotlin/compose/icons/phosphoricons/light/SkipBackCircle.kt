package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) {
            return _skipBackCircle!!
        }
        _skipBackCircle = Builder(name = "SkipBackCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(158.8f, 90.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -6.1f, 0.3f)
                lineTo(106.0f, 122.1f)
                lineTo(106.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(106.0f, 133.9f)
                lineTo(152.7f, 165.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.1f, 0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 162.0f, 160.0f)
                lineTo(162.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.8f, 90.7f)
                close()
                moveTo(150.0f, 148.8f)
                lineTo(118.8f, 128.0f)
                lineTo(150.0f, 107.2f)
                close()
            }
        }
        .build()
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
