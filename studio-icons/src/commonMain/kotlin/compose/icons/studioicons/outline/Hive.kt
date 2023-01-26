package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Hive: ImageVector
    get() {
        if (_hive != null) {
            return _hive!!
        }
        _hive = Builder(name = "Hive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.0f)
                lineToRelative(-2.25f, -4.0f)
                horizontalLineToRelative(-3.31f)
                lineToRelative(-1.69f, -3.0f)
                horizontalLineToRelative(-4.5f)
                lineTo(8.06f, 5.0f)
                horizontalLineTo(4.75f)
                lineTo(2.5f, 9.0f)
                lineToRelative(1.69f, 3.0f)
                lineTo(2.5f, 15.0f)
                lineToRelative(2.25f, 4.0f)
                horizontalLineToRelative(3.31f)
                lineToRelative(1.69f, 3.0f)
                horizontalLineToRelative(4.5f)
                lineToRelative(1.69f, -3.0f)
                horizontalLineToRelative(3.31f)
                lineToRelative(2.25f, -4.0f)
                lineToRelative(-1.69f, -3.0f)
                lineTo(21.5f, 9.0f)
                close()
                moveTo(19.21f, 9.0f)
                lineToRelative(-1.12f, 2.0f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(-1.12f, -2.0f)
                lineToRelative(1.12f, -2.0f)
                horizontalLineToRelative(2.14f)
                lineTo(19.21f, 9.0f)
                close()
                moveTo(10.94f, 14.0f)
                lineToRelative(-1.12f, -2.0f)
                lineToRelative(1.12f, -2.0f)
                horizontalLineToRelative(2.12f)
                lineToRelative(1.12f, 2.0f)
                lineToRelative(-1.12f, 2.0f)
                horizontalLineTo(10.94f)
                close()
                moveTo(13.08f, 4.0f)
                lineToRelative(1.12f, 1.98f)
                lineTo(13.06f, 8.0f)
                horizontalLineToRelative(-2.12f)
                lineTo(9.8f, 5.98f)
                lineTo(10.92f, 4.0f)
                horizontalLineTo(13.08f)
                close()
                moveTo(5.92f, 7.0f)
                horizontalLineToRelative(2.14f)
                lineToRelative(1.12f, 2.0f)
                lineToRelative(-1.12f, 2.0f)
                horizontalLineTo(5.92f)
                lineTo(4.79f, 9.0f)
                lineTo(5.92f, 7.0f)
                close()
                moveTo(4.79f, 15.0f)
                lineToRelative(1.12f, -2.0f)
                horizontalLineToRelative(2.14f)
                lineToRelative(1.12f, 2.0f)
                lineToRelative(-1.12f, 2.0f)
                horizontalLineTo(5.92f)
                lineTo(4.79f, 15.0f)
                close()
                moveTo(10.92f, 20.0f)
                lineTo(9.8f, 18.02f)
                lineTo(10.94f, 16.0f)
                horizontalLineToRelative(2.12f)
                lineToRelative(1.13f, 2.02f)
                lineTo(13.08f, 20.0f)
                horizontalLineTo(10.92f)
                close()
                moveTo(18.08f, 17.0f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(-1.12f, -2.0f)
                lineToRelative(1.12f, -2.0f)
                horizontalLineToRelative(2.14f)
                lineToRelative(1.12f, 2.0f)
                lineTo(18.08f, 17.0f)
                close()
            }
        }
        .build()
        return _hive!!
    }

private var _hive: ImageVector? = null
