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

public val SolidGroup.GreaterThanEqual: ImageVector
    get() {
        if (_greaterThanEqual != null) {
            return _greaterThanEqual!!
        }
        _greaterThanEqual = Builder(name = "GreaterThanEqual", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(55.22f, 107.69f)
                lineToRelative(175.56f, 68.09f)
                lineToRelative(-175.44f, 68.05f)
                curveToRelative(-18.39f, 6.03f, -27.88f, 24.39f, -21.2f, 41.0f)
                lineToRelative(12.09f, 30.08f)
                curveToRelative(6.68f, 16.61f, 26.99f, 25.19f, 45.38f, 19.15f)
                lineTo(393.02f, 214.2f)
                curveToRelative(13.77f, -4.52f, 22.98f, -16.61f, 22.98f, -30.17f)
                verticalLineToRelative(-15.96f)
                curveToRelative(0.0f, -13.56f, -9.21f, -25.65f, -22.98f, -30.17f)
                lineTo(91.3f, 17.92f)
                curveToRelative(-18.29f, -6.0f, -38.51f, 2.53f, -45.15f, 19.06f)
                lineTo(34.12f, 66.9f)
                curveToRelative(-6.64f, 16.53f, 2.81f, 34.79f, 21.1f, 40.79f)
                close()
                moveTo(424.0f, 400.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(400.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _greaterThanEqual!!
    }

private var _greaterThanEqual: ImageVector? = null
