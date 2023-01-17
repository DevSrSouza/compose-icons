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

public val SimpleIcons.Dotnet: ImageVector
    get() {
        if (_dotnet != null) {
            return _dotnet!!
        }
        _dotnet = Builder(name = "Dotnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.77f)
                horizontalLineToRelative(-2.468f)
                verticalLineToRelative(7.565f)
                horizontalLineToRelative(-1.425f)
                lineTo(20.107f, 8.77f)
                horizontalLineToRelative(-2.462f)
                lineTo(17.645f, 7.53f)
                lineTo(24.0f, 7.53f)
                close()
                moveTo(17.148f, 16.335f)
                horizontalLineToRelative(-4.821f)
                lineTo(12.327f, 7.53f)
                horizontalLineToRelative(4.63f)
                verticalLineToRelative(1.24f)
                horizontalLineToRelative(-3.205f)
                verticalLineToRelative(2.494f)
                horizontalLineToRelative(2.953f)
                verticalLineToRelative(1.234f)
                horizontalLineToRelative(-2.953f)
                verticalLineToRelative(2.604f)
                horizontalLineToRelative(3.396f)
                close()
                moveTo(10.44f, 16.335f)
                lineTo(8.882f, 16.335f)
                lineTo(4.78f, 9.863f)
                arcToRelative(2.896f, 2.896f, 0.0f, false, true, -0.258f, -0.51f)
                horizontalLineToRelative(-0.036f)
                curveToRelative(0.032f, 0.189f, 0.048f, 0.592f, 0.048f, 1.21f)
                verticalLineToRelative(5.772f)
                lineTo(3.157f, 16.335f)
                lineTo(3.157f, 7.53f)
                horizontalLineToRelative(1.659f)
                lineToRelative(3.965f, 6.32f)
                curveToRelative(0.167f, 0.261f, 0.275f, 0.442f, 0.323f, 0.54f)
                horizontalLineToRelative(0.024f)
                curveToRelative(-0.04f, -0.233f, -0.06f, -0.629f, -0.06f, -1.185f)
                lineTo(9.068f, 7.529f)
                horizontalLineToRelative(1.372f)
                close()
                moveTo(1.737f, 15.642f)
                arcToRelative(0.868f, 0.829f, 0.0f, false, true, -0.869f, 0.829f)
                arcToRelative(0.868f, 0.829f, 0.0f, false, true, -0.868f, -0.83f)
                arcToRelative(0.868f, 0.829f, 0.0f, false, true, 0.868f, -0.828f)
                arcToRelative(0.868f, 0.829f, 0.0f, false, true, 0.869f, 0.829f)
                close()
            }
        }
        .build()
        return _dotnet!!
    }

private var _dotnet: ImageVector? = null
