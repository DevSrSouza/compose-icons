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

public val BrandsGroup.Vaadin: ImageVector
    get() {
        if (_vaadin != null) {
            return _vaadin!!
        }
        _vaadin = Builder(name = "Vaadin", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.5f, 140.7f)
                curveToRelative(1.5f, -17.6f, 4.9f, -52.7f, 49.8f, -52.7f)
                horizontalLineToRelative(98.6f)
                curveToRelative(20.7f, 0.0f, 32.1f, -7.8f, 32.1f, -21.6f)
                verticalLineTo(54.1f)
                curveToRelative(0.0f, -12.2f, 9.3f, -22.1f, 21.5f, -22.1f)
                reflectiveCurveTo(448.0f, 41.9f, 448.0f, 54.1f)
                verticalLineToRelative(36.5f)
                curveToRelative(0.0f, 42.9f, -21.5f, 62.0f, -66.8f, 62.0f)
                horizontalLineTo(280.7f)
                curveToRelative(-30.1f, 0.0f, -33.0f, 14.7f, -33.0f, 27.1f)
                curveToRelative(0.0f, 1.3f, -0.1f, 2.5f, -0.2f, 3.7f)
                curveToRelative(-0.7f, 12.3f, -10.9f, 22.2f, -23.4f, 22.2f)
                reflectiveCurveToRelative(-22.7f, -9.8f, -23.4f, -22.2f)
                curveToRelative(-0.1f, -1.2f, -0.2f, -2.4f, -0.2f, -3.7f)
                curveToRelative(0.0f, -12.3f, -3.0f, -27.1f, -33.0f, -27.1f)
                horizontalLineTo(66.8f)
                curveToRelative(-45.3f, 0.0f, -66.8f, -19.1f, -66.8f, -62.0f)
                verticalLineTo(54.1f)
                curveTo(0.0f, 41.9f, 9.4f, 32.0f, 21.6f, 32.0f)
                reflectiveCurveToRelative(21.5f, 9.9f, 21.5f, 22.1f)
                verticalLineToRelative(12.3f)
                curveTo(43.1f, 80.2f, 54.5f, 88.0f, 75.2f, 88.0f)
                horizontalLineToRelative(98.6f)
                curveToRelative(44.8f, 0.0f, 48.3f, 35.1f, 49.8f, 52.7f)
                horizontalLineToRelative(0.9f)
                close()
                moveTo(224.0f, 456.0f)
                curveToRelative(11.5f, 0.0f, 21.4f, -7.0f, 25.7f, -16.3f)
                curveToRelative(1.1f, -1.8f, 97.1f, -169.6f, 98.2f, -171.4f)
                curveToRelative(11.9f, -19.6f, -3.2f, -44.3f, -27.2f, -44.3f)
                curveToRelative(-13.9f, 0.0f, -23.3f, 6.4f, -29.8f, 20.3f)
                lineTo(224.0f, 362.0f)
                lineToRelative(-66.9f, -117.7f)
                curveToRelative(-6.4f, -13.9f, -15.9f, -20.3f, -29.8f, -20.3f)
                curveToRelative(-24.0f, 0.0f, -39.1f, 24.6f, -27.2f, 44.3f)
                curveToRelative(1.1f, 1.9f, 97.1f, 169.6f, 98.2f, 171.4f)
                curveToRelative(4.3f, 9.3f, 14.2f, 16.3f, 25.7f, 16.3f)
                close()
            }
        }
        .build()
        return _vaadin!!
    }

private var _vaadin: ImageVector? = null
