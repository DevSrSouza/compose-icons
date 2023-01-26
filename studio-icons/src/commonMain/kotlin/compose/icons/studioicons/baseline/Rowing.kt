package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Rowing: ImageVector
    get() {
        if (_rowing != null) {
            return _rowing!!
        }
        _rowing = Builder(name = "Rowing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                lineTo(4.0f, 19.0f)
                lineToRelative(1.5f, 1.5f)
                lineTo(9.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.5f, 14.5f)
                close()
                moveTo(15.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(16.1f, 1.0f, 15.0f, 1.0f)
                close()
                moveTo(21.0f, 21.01f)
                lineTo(18.0f, 24.0f)
                lineToRelative(-2.99f, -3.01f)
                verticalLineTo(19.5f)
                lineToRelative(-7.1f, -7.09f)
                curveTo(7.6f, 12.46f, 7.3f, 12.48f, 7.0f, 12.48f)
                verticalLineToRelative(-2.16f)
                curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f)
                lineToRelative(1.4f, -1.55f)
                curveTo(13.42f, 6.34f, 14.06f, 6.0f, 14.72f, 6.0f)
                horizontalLineToRelative(0.03f)
                curveTo(15.99f, 6.01f, 17.0f, 7.02f, 17.0f, 8.26f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 0.84f, -0.35f, 1.61f, -0.92f, 2.16f)
                lineToRelative(-3.58f, -3.58f)
                verticalLineToRelative(-2.27f)
                curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f)
                lineTo(16.5f, 18.0f)
                horizontalLineTo(18.0f)
                lineTo(21.0f, 21.01f)
                close()
            }
        }
        .build()
        return _rowing!!
    }

private var _rowing: ImageVector? = null
