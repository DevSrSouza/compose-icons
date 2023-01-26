package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WbIncandescent: ImageVector
    get() {
        if (_wbIncandescent != null) {
            return _wbIncandescent!!
        }
        _wbIncandescent = Builder(name = "WbIncandescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 19.79f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.39f, -0.39f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.02f, 0.0f, -1.4f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.39f, 0.39f)
                curveToRelative(-0.38f, 0.4f, -0.38f, 1.02f, 0.01f, 1.41f)
                close()
                moveTo(11.99f, 23.0f)
                lineTo(12.0f, 23.0f)
                curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.96f)
                curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f)
                verticalLineToRelative(0.96f)
                curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                close()
                moveTo(3.01f, 11.05f)
                lineTo(1.99f, 11.05f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                lineTo(3.0f, 13.04f)
                curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.01f, -0.55f, -0.43f, -0.99f, -0.98f, -0.99f)
                close()
                moveTo(15.0f, 6.86f)
                lineTo(15.0f, 3.05f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.81f)
                curveToRelative(-2.04f, 1.18f, -3.32f, 3.52f, -2.93f, 6.13f)
                curveToRelative(0.4f, 2.61f, 2.56f, 4.7f, 5.18f, 5.02f)
                curveToRelative(3.64f, 0.44f, 6.75f, -2.4f, 6.75f, -5.95f)
                curveToRelative(0.0f, -2.23f, -1.21f, -4.16f, -3.0f, -5.2f)
                close()
                moveTo(20.0f, 12.04f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                lineTo(22.0f, 13.04f)
                curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f)
                close()
                moveTo(17.94f, 19.41f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0.0f)
                curveToRelative(-0.4f, 0.4f, -0.4f, 1.02f, -0.01f, 1.41f)
                close()
            }
        }
        .build()
        return _wbIncandescent!!
    }

private var _wbIncandescent: ImageVector? = null
