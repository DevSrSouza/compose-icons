package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.RamenDining: ImageVector
    get() {
        if (_ramenDining != null) {
            return _ramenDining!!
        }
        _ramenDining = Builder(name = "RamenDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.73f, 18.39f)
                lineToRelative(1.27f, 0.5f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.11f)
                lineToRelative(1.27f, -0.5f)
                curveToRelative(2.16f, -0.85f, 3.74f, -2.47f, 4.4f, -4.39f)
                horizontalLineTo(4.34f)
                curveTo(4.99f, 15.92f, 6.58f, 17.54f, 8.73f, 18.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.51f)
                verticalLineTo(2.0f)
                lineTo(4.0f, 3.99f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.75f)
                curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(4.78f)
                lineTo(22.0f, 3.51f)
                close()
                moveTo(8.0f, 5.06f)
                lineToRelative(1.0f, -0.11f)
                verticalLineTo(6.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.06f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(5.5f, 5.34f)
                lineToRelative(1.0f, -0.11f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.34f)
                close()
                moveTo(5.5f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(19.66f, 14.0f)
                curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f)
                lineTo(14.0f, 18.89f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.11f)
                lineToRelative(-1.27f, -0.5f)
                curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f)
                horizontalLineTo(19.66f)
                close()
            }
        }
        .build()
        return _ramenDining!!
    }

private var _ramenDining: ImageVector? = null
