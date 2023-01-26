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

public val OutlineGroup.Hail: ImageVector
    get() {
        if (_hail != null) {
            return _hail!!
        }
        _hail = Builder(name = "Hail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.7f, -0.93f, 4.41f, -2.3f, 5.5f)
                curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.1f)
                curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f)
                curveTo(7.87f, 10.81f, 7.0f, 11.43f, 7.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveToRelative(0.0f, -2.06f, 0.35f, -3.78f, 2.11f, -5.29f)
                curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f)
                curveTo(15.96f, 5.55f, 17.0f, 4.76f, 17.0f, 2.0f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _hail!!
    }

private var _hail: ImageVector? = null
