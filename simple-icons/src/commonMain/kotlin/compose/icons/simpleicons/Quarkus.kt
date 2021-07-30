package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quarkus: ImageVector
    get() {
        if (_quarkus != null) {
            return _quarkus!!
        }
        _quarkus = Builder(name = "Quarkus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.981f, 0.0f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 0.0f, 3.981f)
                lineTo(0.0f, 20.02f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 3.981f, 24.0f)
                horizontalLineToRelative(10.983f)
                lineTo(12.0f, 16.8f)
                lineToRelative(-2.15f, 4.546f)
                lineTo(3.98f, 21.346f)
                curveToRelative(-0.72f, 0.0f, -1.327f, -0.608f, -1.327f, -1.327f)
                lineTo(2.653f, 3.98f)
                curveToRelative(0.0f, -0.72f, 0.608f, -1.327f, 1.327f, -1.327f)
                horizontalLineToRelative(16.04f)
                curveToRelative(0.72f, 0.0f, 1.327f, 0.608f, 1.327f, 1.327f)
                verticalLineToRelative(16.04f)
                curveToRelative(0.0f, 0.72f, -0.608f, 1.327f, -1.327f, 1.327f)
                horizontalLineToRelative(-3.48f)
                lineTo(17.63f, 24.0f)
                horizontalLineToRelative(2.388f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 24.0f, 20.019f)
                lineTo(24.0f, 3.98f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 20.019f, 0.0f)
                close()
                moveTo(8.305f, 4.217f)
                verticalLineToRelative(3.858f)
                lineToRelative(3.341f, -1.93f)
                close()
                moveTo(15.695f, 4.217f)
                lineToRelative(-3.341f, 1.929f)
                lineToRelative(3.34f, 1.929f)
                close()
                moveTo(12.0f, 6.35f)
                lineTo(8.305f, 8.483f)
                lineTo(12.0f, 10.617f)
                lineToRelative(3.695f, -2.134f)
                close()
                moveTo(8.104f, 8.832f)
                verticalLineToRelative(4.266f)
                lineToRelative(3.695f, 2.133f)
                verticalLineToRelative(-4.266f)
                close()
                moveTo(15.896f, 8.832f)
                lineTo(12.2f, 10.965f)
                verticalLineToRelative(4.266f)
                lineToRelative(3.695f, -2.133f)
                close()
                moveTo(7.75f, 9.036f)
                lineToRelative(-3.34f, 1.93f)
                lineToRelative(3.34f, 1.928f)
                close()
                moveTo(16.25f, 9.036f)
                verticalLineToRelative(3.858f)
                lineToRelative(3.34f, -1.929f)
                close()
                moveTo(8.104f, 13.506f)
                verticalLineToRelative(3.859f)
                lineToRelative(3.341f, -1.93f)
                close()
                moveTo(15.896f, 13.506f)
                lineToRelative(-3.341f, 1.93f)
                lineToRelative(3.34f, 1.929f)
                close()
            }
        }
        .build()
        return _quarkus!!
    }

private var _quarkus: ImageVector? = null
