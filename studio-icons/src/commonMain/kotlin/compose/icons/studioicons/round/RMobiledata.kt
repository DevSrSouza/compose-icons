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

public val RoundGroup.RMobiledata: ImageVector
    get() {
        if (_rMobiledata != null) {
            return _rMobiledata!!
        }
        _rMobiledata = Builder(name = "RMobiledata", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 7.2f)
                lineToRelative(0.65f, 1.52f)
                curveTo(8.71f, 9.33f, 8.27f, 10.0f, 7.61f, 10.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.37f, 0.0f, -0.7f, -0.22f, -0.85f, -0.56f)
                lineTo(5.87f, 7.33f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.75f)
                curveTo(4.0f, 9.59f, 3.59f, 10.0f, 3.08f, 10.0f)
                horizontalLineTo(2.92f)
                curveTo(2.41f, 10.0f, 2.0f, 9.59f, 2.0f, 9.08f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(1.33f)
                curveTo(9.0f, 6.13f, 8.47f, 6.87f, 7.8f, 7.2f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.33f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _rMobiledata!!
    }

private var _rMobiledata: ImageVector? = null
