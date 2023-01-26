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

public val BaselineGroup.AddAlert: ImageVector
    get() {
        if (_addAlert != null) {
            return _addAlert!!
        }
        _addAlert = Builder(name = "AddAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.01f, 21.01f)
                curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                reflectiveCurveToRelative(1.99f, -0.89f, 1.99f, -1.99f)
                horizontalLineToRelative(-3.98f)
                close()
                moveTo(18.88f, 16.82f)
                lineTo(18.88f, 11.0f)
                curveToRelative(0.0f, -3.25f, -2.25f, -5.97f, -5.29f, -6.69f)
                verticalLineToRelative(-0.72f)
                curveTo(13.59f, 2.71f, 12.88f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-1.59f, 0.71f, -1.59f, 1.59f)
                verticalLineToRelative(0.72f)
                curveTo(7.37f, 5.03f, 5.12f, 7.75f, 5.12f, 11.0f)
                verticalLineToRelative(5.82f)
                lineTo(3.0f, 18.94f)
                lineTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.06f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(16.0f, 13.01f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 13.01f)
                lineTo(8.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.01f)
                close()
            }
        }
        .build()
        return _addAlert!!
    }

private var _addAlert: ImageVector? = null
