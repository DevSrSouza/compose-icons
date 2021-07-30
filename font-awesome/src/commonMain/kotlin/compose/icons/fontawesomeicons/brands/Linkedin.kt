package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 32.0f)
                lineTo(31.9f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.5f, 0.0f, 64.3f)
                verticalLineToRelative(383.4f)
                curveTo(0.0f, 465.5f, 14.3f, 480.0f, 31.9f, 480.0f)
                lineTo(416.0f, 480.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, -14.5f, 32.0f, -32.3f)
                lineTo(448.0f, 64.3f)
                curveToRelative(0.0f, -17.8f, -14.4f, -32.3f, -32.0f, -32.3f)
                close()
                moveTo(135.4f, 416.0f)
                lineTo(69.0f, 416.0f)
                lineTo(69.0f, 202.2f)
                horizontalLineToRelative(66.5f)
                lineTo(135.5f, 416.0f)
                close()
                moveTo(102.2f, 173.0f)
                curveToRelative(-21.3f, 0.0f, -38.5f, -17.3f, -38.5f, -38.5f)
                reflectiveCurveTo(80.9f, 96.0f, 102.2f, 96.0f)
                curveToRelative(21.2f, 0.0f, 38.5f, 17.3f, 38.5f, 38.5f)
                curveToRelative(0.0f, 21.3f, -17.2f, 38.5f, -38.5f, 38.5f)
                close()
                moveTo(384.3f, 416.0f)
                horizontalLineToRelative(-66.4f)
                lineTo(317.9f, 312.0f)
                curveToRelative(0.0f, -24.8f, -0.5f, -56.7f, -34.5f, -56.7f)
                curveToRelative(-34.6f, 0.0f, -39.9f, 27.0f, -39.9f, 54.9f)
                lineTo(243.5f, 416.0f)
                horizontalLineToRelative(-66.4f)
                lineTo(177.1f, 202.2f)
                horizontalLineToRelative(63.7f)
                verticalLineToRelative(29.2f)
                horizontalLineToRelative(0.9f)
                curveToRelative(8.9f, -16.8f, 30.6f, -34.5f, 62.9f, -34.5f)
                curveToRelative(67.2f, 0.0f, 79.7f, 44.3f, 79.7f, 101.9f)
                lineTo(384.3f, 416.0f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
