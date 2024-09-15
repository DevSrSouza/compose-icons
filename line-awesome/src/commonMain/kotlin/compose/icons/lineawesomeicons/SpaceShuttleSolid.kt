package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SpaceShuttleSolid: ImageVector
    get() {
        if (_spaceShuttleSolid != null) {
            return _spaceShuttleSolid!!
        }
        _spaceShuttleSolid = Builder(name = "SpaceShuttleSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                lineTo(2.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                lineTo(1.0f, 19.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 28.0f)
                lineTo(6.563f, 28.0f)
                curveTo(9.02f, 28.0f, 11.387f, 27.02f, 13.125f, 25.281f)
                lineTo(17.469f, 20.969f)
                lineTo(25.5f, 20.281f)
                curveTo(28.074f, 20.066f, 30.41f, 18.711f, 31.844f, 16.563f)
                lineTo(32.188f, 16.0f)
                lineTo(31.844f, 15.438f)
                curveTo(30.41f, 13.289f, 28.074f, 11.934f, 25.5f, 11.719f)
                lineTo(17.469f, 11.031f)
                lineTo(13.281f, 6.844f)
                lineTo(13.125f, 6.719f)
                curveTo(11.387f, 4.98f, 9.02f, 4.0f, 6.563f, 4.0f)
                close()
                moveTo(4.0f, 6.0f)
                lineTo(6.563f, 6.0f)
                curveTo(8.492f, 6.0f, 10.355f, 6.762f, 11.719f, 8.125f)
                lineTo(14.563f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(25.313f, 13.688f)
                curveTo(27.0f, 13.828f, 28.465f, 14.738f, 29.563f, 16.0f)
                curveTo(28.465f, 17.262f, 27.0f, 18.172f, 25.313f, 18.313f)
                lineTo(16.906f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 21.0f)
                lineTo(14.563f, 21.0f)
                lineTo(11.719f, 23.875f)
                curveTo(10.355f, 25.238f, 8.492f, 26.0f, 6.563f, 26.0f)
                lineTo(4.0f, 26.0f)
                lineTo(4.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(24.0f, 15.0f)
                lineTo(24.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 15.0f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(6.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 21.0f)
                close()
            }
        }
        .build()
        return _spaceShuttleSolid!!
    }

private var _spaceShuttleSolid: ImageVector? = null
