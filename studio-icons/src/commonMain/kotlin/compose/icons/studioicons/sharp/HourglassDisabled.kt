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

public val SharpGroup.HourglassDisabled: ImageVector
    get() {
        if (_hourglassDisabled != null) {
            return _hourglassDisabled!!
        }
        _hourglassDisabled = Builder(name = "HourglassDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 3.5f)
                lineToRelative(-2.84f, 2.84f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(0.01f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-12.0f, 0.0f)
                lineToRelative(0.0f, 1.17f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(8.9f, 8.9f)
                lineTo(6.0f, 16.0f)
                lineToRelative(0.01f, 0.01f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                close()
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(2.84f, -2.84f)
                lineTo(16.0f, 18.83f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _hourglassDisabled!!
    }

private var _hourglassDisabled: ImageVector? = null
