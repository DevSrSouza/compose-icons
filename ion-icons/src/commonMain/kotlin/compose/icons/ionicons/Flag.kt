package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(68.13f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 75.9f, 47.41f)
                curveTo(88.0f, 40.38f, 112.38f, 32.0f, 160.0f, 32.0f)
                curveToRelative(37.21f, 0.0f, 78.83f, 14.71f, 115.55f, 27.68f)
                curveTo(305.12f, 70.13f, 333.05f, 80.0f, 352.0f, 80.0f)
                arcToRelative(183.84f, 183.84f, 0.0f, false, false, 71.0f, -14.5f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.0f, 16.58f)
                verticalLineTo(301.44f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -12.0f, 18.31f)
                curveToRelative(-8.71f, 3.81f, -40.51f, 16.25f, -84.0f, 16.25f)
                curveToRelative(-24.14f, 0.0f, -54.38f, -7.14f, -86.39f, -14.71f)
                curveTo(229.63f, 312.79f, 192.43f, 304.0f, 160.0f, 304.0f)
                curveToRelative(-36.87f, 0.0f, -55.74f, 5.58f, -64.0f, 9.11f)
                verticalLineTo(464.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 480.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
