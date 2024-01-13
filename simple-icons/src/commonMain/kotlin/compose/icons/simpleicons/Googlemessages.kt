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

public val SimpleIcons.Googlemessages: ImageVector
    get() {
        if (_googlemessages != null) {
            return _googlemessages!!
        }
        _googlemessages = Builder(name = "Googlemessages", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(4.911f, 7.089f)
                horizontalLineToRelative(11.456f)
                arcToRelative(2.197f, 2.197f, 0.0f, false, true, 2.165f, 2.19f)
                verticalLineToRelative(5.863f)
                arcToRelative(2.213f, 2.213f, 0.0f, false, true, -2.177f, 2.178f)
                lineTo(8.04f, 17.32f)
                curveToRelative(-1.174f, 0.0f, -2.04f, -0.99f, -2.04f, -2.178f)
                verticalLineToRelative(-4.639f)
                lineTo(4.503f, 7.905f)
                curveToRelative(-0.31f, -0.42f, -0.05f, -0.816f, 0.408f, -0.816f)
                close()
                moveTo(8.326f, 9.279f)
                curveToRelative(-0.347f, 0.0f, -0.68f, 0.21f, -0.68f, 0.544f)
                curveToRelative(0.0f, 0.334f, 0.333f, 0.544f, 0.68f, 0.544f)
                horizontalLineToRelative(7.905f)
                curveToRelative(0.346f, 0.0f, 0.68f, -0.21f, 0.68f, -0.544f)
                curveToRelative(0.0f, -0.334f, -0.334f, -0.545f, -0.68f, -0.545f)
                close()
                moveTo(8.326f, 11.456f)
                curveToRelative(-0.347f, 0.0f, -0.68f, 0.21f, -0.68f, 0.544f)
                curveToRelative(0.0f, 0.334f, 0.333f, 0.544f, 0.68f, 0.544f)
                horizontalLineToRelative(7.905f)
                curveToRelative(0.346f, 0.0f, 0.68f, -0.21f, 0.68f, -0.544f)
                curveToRelative(0.0f, -0.334f, -0.334f, -0.544f, -0.68f, -0.544f)
                close()
                moveTo(8.313f, 13.646f)
                curveToRelative(-0.346f, 0.0f, -0.68f, 0.21f, -0.68f, 0.544f)
                curveToRelative(0.0f, 0.334f, 0.334f, 0.544f, 0.68f, 0.544f)
                horizontalLineToRelative(5.728f)
                curveToRelative(0.347f, 0.0f, 0.68f, -0.21f, 0.68f, -0.544f)
                curveToRelative(0.0f, -0.334f, -0.333f, -0.545f, -0.68f, -0.545f)
                close()
            }
        }
        .build()
        return _googlemessages!!
    }

private var _googlemessages: ImageVector? = null
