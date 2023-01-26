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

public val BaselineGroup.BusAlert: ImageVector
    get() {
        if (_busAlert != null) {
            return _busAlert!!
        }
        _busAlert = Builder(name = "BusAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.78f, 3.05f)
                lineToRelative(0.02f, -0.03f)
                curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f)
                lineTo(2.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f)
                verticalLineToRelative(-3.08f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 1.0f)
                close()
                moveTo(4.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(3.0f, 13.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.96f, 0.81f, 3.73f, 2.11f, 5.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(13.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(16.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _busAlert!!
    }

private var _busAlert: ImageVector? = null
