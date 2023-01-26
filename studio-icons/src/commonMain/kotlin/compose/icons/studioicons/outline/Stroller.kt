package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Stroller: ImageVector
    get() {
        if (_stroller != null) {
            return _stroller!!
        }
        _stroller = Builder(name = "Stroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(18.0f, 18.9f, 18.0f, 20.0f)
                close()
                moveTo(6.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f)
                close()
                moveTo(15.0f, 8.66f)
                lineTo(9.6f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.66f)
                moveTo(18.65f, 3.0f)
                curveTo(20.52f, 3.0f, 22.0f, 4.56f, 22.0f, 6.48f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.48f)
                curveTo(20.0f, 5.66f, 19.42f, 5.0f, 18.65f, 5.0f)
                curveTo(17.97f, 5.0f, 17.58f, 5.59f, 17.0f, 6.27f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(7.43f)
                curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f)
                lineToRelative(8.8f, -10.32f)
                curveTo(16.11f, 4.27f, 16.99f, 3.0f, 18.65f, 3.0f)
                lineTo(18.65f, 3.0f)
                close()
                moveTo(10.0f, 5.0f)
                curveTo(9.35f, 5.0f, 8.71f, 5.09f, 8.09f, 5.27f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(1.37f, -1.61f)
                curveTo(10.58f, 5.02f, 10.29f, 5.0f, 10.0f, 5.0f)
                moveTo(10.0f, 3.0f)
                curveToRelative(1.56f, 0.0f, 3.03f, 0.4f, 4.3f, 1.1f)
                lineToRelative(-4.7f, 5.51f)
                lineTo(4.72f, 4.72f)
                curveTo(6.21f, 3.64f, 8.03f, 3.0f, 10.0f, 3.0f)
                lineTo(10.0f, 3.0f)
                close()
            }
        }
        .build()
        return _stroller!!
    }

private var _stroller: ImageVector? = null
