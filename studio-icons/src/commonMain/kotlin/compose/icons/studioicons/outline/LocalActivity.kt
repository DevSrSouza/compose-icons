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

public val OutlineGroup.LocalActivity: ImageVector
    get() {
        if (_localActivity != null) {
            return _localActivity!!
        }
        _localActivity = Builder(name = "LocalActivity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, 0.9f, 1.99f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(20.0f, 8.54f)
                curveToRelative(-1.19f, 0.69f, -2.0f, 1.99f, -2.0f, 3.46f)
                reflectiveCurveToRelative(0.81f, 2.77f, 2.0f, 3.46f)
                lineTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-2.54f)
                curveToRelative(1.19f, -0.69f, 2.0f, -1.99f, 2.0f, -3.46f)
                curveToRelative(0.0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.54f)
                close()
                moveTo(9.07f, 16.0f)
                lineTo(12.0f, 14.12f)
                lineTo(14.93f, 16.0f)
                lineToRelative(-0.89f, -3.36f)
                lineToRelative(2.69f, -2.2f)
                lineToRelative(-3.47f, -0.21f)
                lineTo(12.0f, 7.0f)
                lineToRelative(-1.27f, 3.22f)
                lineToRelative(-3.47f, 0.21f)
                lineToRelative(2.69f, 2.2f)
                close()
            }
        }
        .build()
        return _localActivity!!
    }

private var _localActivity: ImageVector? = null
