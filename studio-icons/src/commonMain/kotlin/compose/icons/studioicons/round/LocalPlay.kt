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

public val RoundGroup.LocalPlay: ImageVector
    get() {
        if (_localPlay != null) {
            return _localPlay!!
        }
        _localPlay = Builder(name = "LocalPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, -0.76f, 0.43f, -1.42f, 1.06f, -1.76f)
                curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 1.99f)
                verticalLineToRelative(2.55f)
                curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f)
                curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f)
                reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f)
                curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f)
                verticalLineToRelative(2.25f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f)
                curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f)
                close()
                moveTo(14.5f, 16.1f)
                lineTo(12.0f, 14.5f)
                lineToRelative(-2.5f, 1.61f)
                curveToRelative(-0.38f, 0.24f, -0.87f, -0.11f, -0.75f, -0.55f)
                lineToRelative(0.75f, -2.88f)
                lineToRelative(-2.3f, -1.88f)
                curveToRelative(-0.35f, -0.29f, -0.17f, -0.86f, 0.29f, -0.89f)
                lineToRelative(2.96f, -0.17f)
                lineToRelative(1.08f, -2.75f)
                curveToRelative(0.17f, -0.42f, 0.77f, -0.42f, 0.93f, 0.0f)
                lineToRelative(1.08f, 2.76f)
                lineToRelative(2.96f, 0.17f)
                curveToRelative(0.45f, 0.03f, 0.64f, 0.6f, 0.29f, 0.89f)
                lineToRelative(-2.3f, 1.88f)
                lineToRelative(0.76f, 2.86f)
                curveToRelative(0.12f, 0.45f, -0.37f, 0.8f, -0.75f, 0.55f)
                close()
            }
        }
        .build()
        return _localPlay!!
    }

private var _localPlay: ImageVector? = null
