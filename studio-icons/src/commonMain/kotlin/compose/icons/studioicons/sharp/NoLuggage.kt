package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoLuggage: ImageVector
    get() {
        if (_noLuggage != null) {
            return _noLuggage!!
        }
        _noLuggage = Builder(name = "NoLuggage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 9.0f)
                verticalLineToRelative(0.92f)
                lineToRelative(1.75f, 1.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(4.17f)
                lineToRelative(3.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(8.83f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(10.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.17f)
                lineToRelative(1.61f, 1.61f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(-7.17f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(11.25f, 18.0f)
                verticalLineToRelative(-3.92f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _noLuggage!!
    }

private var _noLuggage: ImageVector? = null
