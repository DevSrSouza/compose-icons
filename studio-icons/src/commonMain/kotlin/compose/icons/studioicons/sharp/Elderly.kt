package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Elderly: ImageVector
    get() {
        if (_elderly != null) {
            return _elderly!!
        }
        _elderly = Builder(name = "Elderly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(20.0f, 12.5f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(12.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(18.0f, 12.22f, 18.0f, 12.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.69f)
                curveToRelative(-1.46f, -0.38f, -2.7f, -1.29f, -3.51f, -2.52f)
                curveTo(13.18f, 11.16f, 13.0f, 12.07f, 13.0f, 13.0f)
                curveToRelative(0.0f, 0.23f, 0.02f, 0.46f, 0.03f, 0.69f)
                lineTo(15.0f, 16.5f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-1.78f, -2.54f)
                lineTo(11.0f, 19.0f)
                lineToRelative(-3.0f, 4.0f)
                lineToRelative(-1.6f, -1.2f)
                lineTo(9.0f, 18.33f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, -1.15f, 0.18f, -2.29f, 0.5f, -3.39f)
                lineTo(8.0f, 10.46f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.3f)
                lineToRelative(5.4f, -3.07f)
                lineToRelative(0.0f, 0.01f)
                curveToRelative(0.59f, -0.31f, 1.32f, -0.33f, 1.94f, 0.03f)
                curveToRelative(0.36f, 0.21f, 0.63f, 0.51f, 0.8f, 0.85f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.79f, 1.67f)
                curveTo(15.58f, 10.1f, 16.94f, 11.0f, 18.5f, 11.0f)
                curveTo(19.33f, 11.0f, 20.0f, 11.67f, 20.0f, 12.5f)
                close()
            }
        }
        .build()
        return _elderly!!
    }

private var _elderly: ImageVector? = null
