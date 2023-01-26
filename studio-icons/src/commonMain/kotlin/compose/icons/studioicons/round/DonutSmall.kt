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

public val RoundGroup.DonutSmall: ImageVector
    get() {
        if (_donutSmall != null) {
            return _donutSmall!!
        }
        _donutSmall = Builder(name = "DonutSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.18f)
                verticalLineToRelative(17.64f)
                curveToRelative(0.0f, 0.64f, -0.59f, 1.12f, -1.21f, 0.98f)
                curveTo(5.32f, 20.8f, 2.0f, 16.79f, 2.0f, 12.0f)
                reflectiveCurveToRelative(3.32f, -8.8f, 7.79f, -9.8f)
                curveToRelative(0.62f, -0.14f, 1.21f, 0.34f, 1.21f, 0.98f)
                close()
                moveTo(13.03f, 3.18f)
                verticalLineToRelative(6.81f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.79f)
                curveToRelative(0.64f, 0.0f, 1.12f, -0.59f, 0.98f, -1.22f)
                curveToRelative(-0.85f, -3.76f, -3.8f, -6.72f, -7.55f, -7.57f)
                curveToRelative(-0.63f, -0.14f, -1.22f, 0.34f, -1.22f, 0.98f)
                close()
                moveTo(13.03f, 14.01f)
                verticalLineToRelative(6.81f)
                curveToRelative(0.0f, 0.64f, 0.59f, 1.12f, 1.22f, 0.98f)
                curveToRelative(3.76f, -0.85f, 6.71f, -3.82f, 7.56f, -7.58f)
                curveToRelative(0.14f, -0.62f, -0.35f, -1.22f, -0.98f, -1.22f)
                horizontalLineToRelative(-6.79f)
                curveToRelative(-0.56f, 0.01f, -1.01f, 0.46f, -1.01f, 1.01f)
                close()
            }
        }
        .build()
        return _donutSmall!!
    }

private var _donutSmall: ImageVector? = null
