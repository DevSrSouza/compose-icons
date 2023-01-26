package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RawOff: ImageVector
    get() {
        if (_rawOff != null) {
            return _rawOff!!
        }
        _rawOff = Builder(name = "RawOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.15f, 14.32f)
                lineToRelative(0.59f, -2.36f)
                lineToRelative(0.76f, 3.04f)
                lineToRelative(1.48f, 0.0f)
                lineToRelative(1.5f, -6.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(-0.74f, 3.0f)
                lineToRelative(-0.74f, -3.0f)
                lineToRelative(-1.52f, 0.0f)
                lineToRelative(-0.74f, 3.0f)
                lineToRelative(-0.74f, -3.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(0.72f, 2.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineTo(6.17f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2.0f)
                horizontalLineTo(8.0f)
                lineToRelative(-0.9f, -2.1f)
                curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f)
                verticalLineToRelative(-0.67f)
                lineToRelative(1.43f, 1.43f)
                lineTo(8.75f, 15.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.38f, -1.5f)
                horizontalLineToRelative(0.04f)
                lineToRelative(9.11f, 9.11f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(6.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _rawOff!!
    }

private var _rawOff: ImageVector? = null