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

public val LightGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.5f, 56.3f)
                curveToRelative(-0.2f, -0.1f, -0.2f, -0.3f, -0.4f, -0.4f)
                reflectiveCurveToRelative(-0.3f, -0.2f, -0.4f, -0.4f)
                arcToRelative(102.1f, 102.1f, 0.0f, true, false, 0.8f, 0.8f)
                close()
                moveTo(165.5f, 122.0f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, -6.7f, -16.3f)
                lineToRelative(36.9f, -36.9f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(154.0f, 128.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 154.0f, 128.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 187.2f, 60.3f)
                lineTo(150.3f, 97.2f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 165.5f, 134.0f)
                horizontalLineToRelative(52.3f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
