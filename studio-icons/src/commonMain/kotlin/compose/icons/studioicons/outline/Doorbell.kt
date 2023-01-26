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

public val OutlineGroup.Doorbell: ImageVector
    get() {
        if (_doorbell != null) {
            return _doorbell!!
        }
        _doorbell = Builder(name = "Doorbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveTo(11.0f, 17.05f, 11.0f, 16.5f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0.0f, -1.54f, -0.81f, -2.82f, -2.25f, -3.16f)
                verticalLineTo(9.25f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineTo(9.5f)
                curveTo(9.82f, 9.84f, 9.0f, 11.12f, 9.0f, 12.66f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(12.0f, 5.5f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-9.0f)
                lineTo(12.0f, 5.5f)
                moveTo(12.0f, 3.0f)
                lineToRelative(8.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _doorbell!!
    }

private var _doorbell: ImageVector? = null
