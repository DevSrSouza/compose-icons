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

public val SimpleIcons.Stackexchange: ImageVector
    get() {
        if (_stackexchange != null) {
            return _stackexchange!!
        }
        _stackexchange = Builder(name = "Stackexchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.728f, 15.577f)
                verticalLineToRelative(1.036f)
                curveToRelative(0.0f, 1.754f, -1.395f, 3.177f, -3.1f, 3.177f)
                horizontalLineToRelative(-0.904f)
                lineTo(13.645f, 24.0f)
                verticalLineToRelative(-4.21f)
                lineTo(5.371f, 19.79f)
                curveToRelative(-1.704f, 0.0f, -3.099f, -1.423f, -3.099f, -3.181f)
                verticalLineToRelative(-1.032f)
                horizontalLineToRelative(19.456f)
                close()
                moveTo(2.275f, 10.463f)
                horizontalLineToRelative(19.323f)
                verticalLineToRelative(3.979f)
                lineTo(2.275f, 14.442f)
                verticalLineToRelative(-3.979f)
                close()
                moveTo(2.275f, 5.322f)
                horizontalLineToRelative(19.323f)
                verticalLineToRelative(3.979f)
                lineTo(2.275f, 9.301f)
                lineTo(2.275f, 5.322f)
                close()
                moveTo(18.575f, 0.0f)
                curveToRelative(1.681f, 0.0f, 3.023f, 1.42f, 3.023f, 3.178f)
                verticalLineToRelative(1.034f)
                lineTo(2.275f, 4.212f)
                lineTo(2.275f, 3.178f)
                curveTo(2.275f, 1.422f, 3.67f, 0.0f, 5.375f, 0.0f)
                horizontalLineToRelative(13.2f)
                close()
            }
        }
        .build()
        return _stackexchange!!
    }

private var _stackexchange: ImageVector? = null
