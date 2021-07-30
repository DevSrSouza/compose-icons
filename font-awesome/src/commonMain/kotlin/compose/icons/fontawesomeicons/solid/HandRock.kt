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

public val SolidGroup.HandRock: ImageVector
    get() {
        if (_handRock != null) {
            return _handRock!!
        }
        _handRock = Builder(name = "HandRock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.8f, 80.0f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(96.8f)
                curveToRelative(0.0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(80.8f)
                curveToRelative(0.0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(96.8f)
                curveToRelative(0.0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48.0f)
                verticalLineToRelative(136.0f)
                lineToRelative(-8.0f, -7.1f)
                verticalLineToRelative(-48.1f)
                curveToRelative(0.0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveTo(21.9f, 127.6f, 0.0f, 149.2f, 0.0f, 176.0f)
                verticalLineToRelative(66.4f)
                curveToRelative(0.0f, 27.4f, 11.7f, 53.5f, 32.2f, 71.8f)
                lineToRelative(111.7f, 99.3f)
                curveToRelative(10.2f, 9.1f, 16.1f, 22.2f, 16.1f, 35.9f)
                verticalLineToRelative(6.7f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-2.9f)
                curveToRelative(0.0f, -12.8f, 2.6f, -25.5f, 7.5f, -37.3f)
                lineToRelative(49.0f, -116.3f)
                curveToRelative(5.0f, -11.8f, 7.5f, -24.5f, 7.5f, -37.3f)
                verticalLineTo(128.8f)
                curveToRelative(0.0f, -26.3f, -20.9f, -48.4f, -47.2f, -48.8f)
                close()
            }
        }
        .build()
        return _handRock!!
    }

private var _handRock: ImageVector? = null
