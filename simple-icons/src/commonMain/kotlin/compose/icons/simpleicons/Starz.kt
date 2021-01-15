package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Starz: ImageVector
    get() {
        if (_starz != null) {
            return _starz!!
        }
        _starz = Builder(name = "Starz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.565f, 11.472f)
                curveToRelative(-0.94f, -0.223f, -1.274f, -0.375f, -1.274f, -0.809f)
                curveToRelative(0.0f, -0.36f, 0.334f, -0.59f, 0.83f, -0.59f)
                curveToRelative(0.76f, 0.0f, 1.44f, 0.524f, 1.623f, 0.68f)
                lineToRelative(0.487f, -0.988f)
                arcToRelative(3.247f, 3.247f, 0.0f, false, false, -2.093f, -0.729f)
                curveToRelative(-1.175f, 0.0f, -1.995f, 0.704f, -1.995f, 1.707f)
                curveToRelative(0.0f, 1.097f, 0.707f, 1.474f, 1.928f, 1.77f)
                curveToRelative(1.022f, 0.235f, 1.202f, 0.438f, 1.202f, 0.776f)
                curveToRelative(0.0f, 0.4f, -0.358f, 0.639f, -0.911f, 0.639f)
                curveToRelative(-0.683f, 0.0f, -1.242f, -0.261f, -1.884f, -0.86f)
                lineTo(0.0f, 14.093f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, false, 2.338f, 0.87f)
                curveToRelative(1.266f, 0.0f, 2.083f, -0.68f, 2.083f, -1.77f)
                curveToRelative(0.0f, -0.897f, -0.537f, -1.4f, -1.856f, -1.721f)
                moveTo(24.0f, 9.134f)
                horizontalLineToRelative(-4.737f)
                verticalLineToRelative(1.05f)
                horizontalLineToRelative(2.709f)
                lineToRelative(-2.942f, 4.682f)
                horizontalLineToRelative(4.91f)
                verticalLineToRelative(-1.05f)
                horizontalLineToRelative(-2.882f)
                lineTo(24.0f, 9.133f)
                moveToRelative(-7.762f, 2.52f)
                horizontalLineToRelative(-0.848f)
                verticalLineToRelative(-1.469f)
                horizontalLineToRelative(0.848f)
                curveToRelative(0.625f, 0.0f, 0.97f, 0.253f, 0.97f, 0.731f)
                curveToRelative(0.0f, 0.475f, -0.363f, 0.737f, -0.97f, 0.737f)
                close()
                moveTo(18.381f, 10.886f)
                curveToRelative(0.0f, -0.505f, -0.183f, -0.938f, -0.528f, -1.254f)
                curveToRelative(-0.358f, -0.327f, -0.866f, -0.5f, -1.469f, -0.5f)
                horizontalLineToRelative(-2.159f)
                verticalLineToRelative(5.733f)
                horizontalLineToRelative(1.165f)
                verticalLineToRelative(-2.09f)
                horizontalLineToRelative(0.83f)
                lineToRelative(1.204f, 2.09f)
                horizontalLineToRelative(1.336f)
                lineToRelative(-1.362f, -2.371f)
                curveToRelative(0.857f, -0.402f, 0.983f, -1.184f, 0.983f, -1.608f)
                moveToRelative(-9.2f, -1.753f)
                lineTo(4.62f, 9.133f)
                verticalLineToRelative(1.051f)
                horizontalLineToRelative(1.698f)
                verticalLineToRelative(4.681f)
                horizontalLineToRelative(1.165f)
                verticalLineToRelative(-4.681f)
                horizontalLineToRelative(1.699f)
                verticalLineToRelative(-1.05f)
                moveToRelative(1.157f, 3.787f)
                lineToRelative(0.709f, -1.405f)
                lineToRelative(0.709f, 1.405f)
                close()
                moveTo(9.357f, 14.866f)
                lineToRelative(0.45f, -0.894f)
                horizontalLineToRelative(2.48f)
                lineToRelative(0.452f, 0.894f)
                horizontalLineToRelative(1.216f)
                lineToRelative(-2.907f, -5.759f)
                lineToRelative(-2.891f, 5.76f)
                horizontalLineToRelative(1.2f)
                close()
            }
        }
        .build()
        return _starz!!
    }

private var _starz: ImageVector? = null
