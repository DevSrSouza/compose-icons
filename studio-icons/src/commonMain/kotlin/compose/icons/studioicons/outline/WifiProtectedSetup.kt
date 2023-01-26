package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.WifiProtectedSetup: ImageVector
    get() {
        if (_wifiProtectedSetup != null) {
            return _wifiProtectedSetup!!
        }
        _wifiProtectedSetup = Builder(name = "WifiProtectedSetup", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.71f, 5.29f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(2.3f, -2.3f)
                curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f)
                curveToRelative(0.0f, 1.31f, -0.32f, 2.54f, -0.88f, 3.63f)
                curveToRelative(2.33f, -1.52f, 3.88f, -4.14f, 3.88f, -7.13f)
                curveTo(19.55f, 9.1f, 18.44f, 6.85f, 16.71f, 5.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.46f, 8.88f)
                curveToRelative(0.0f, -1.31f, 0.32f, -2.54f, 0.88f, -3.63f)
                curveTo(6.0f, 6.77f, 4.46f, 9.39f, 4.46f, 12.38f)
                curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(-2.3f, 2.3f)
                curveTo(8.74f, 13.84f, 7.46f, 11.52f, 7.46f, 8.88f)
                close()
            }
        }
        .build()
        return _wifiProtectedSetup!!
    }

private var _wifiProtectedSetup: ImageVector? = null
