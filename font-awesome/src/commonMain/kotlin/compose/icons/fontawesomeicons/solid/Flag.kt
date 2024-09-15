package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.57f, 98.78f)
                curveTo(295.98f, 98.78f, 251.72f, 64.0f, 184.35f, 64.0f)
                curveToRelative(-24.95f, 0.0f, -47.31f, 4.38f, -68.04f, 12.01f)
                arcToRelative(55.95f, 55.95f, 0.0f, false, false, 3.59f, -23.56f)
                curveTo(118.12f, 24.01f, 94.81f, 1.21f, 66.34f, 0.05f)
                curveTo(34.35f, -1.25f, 8.0f, 24.3f, 8.0f, 56.0f)
                curveToRelative(0.0f, 19.03f, 9.5f, 35.83f, 24.0f, 45.94f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-94.4f)
                curveToRelative(28.31f, -12.06f, 63.58f, -22.12f, 114.43f, -22.12f)
                curveToRelative(53.59f, 0.0f, 97.84f, 34.78f, 165.22f, 34.78f)
                curveToRelative(48.17f, 0.0f, 86.67f, -16.29f, 122.5f, -40.86f)
                curveTo(506.84f, 359.45f, 512.0f, 349.57f, 512.0f, 339.05f)
                verticalLineToRelative(-243.1f)
                curveToRelative(0.0f, -23.39f, -24.27f, -38.87f, -45.49f, -29.02f)
                curveToRelative(-34.34f, 15.95f, -76.45f, 31.85f, -116.95f, 31.85f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
