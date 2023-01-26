package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FlashlightOn: ImageVector
    get() {
        if (_flashlightOn != null) {
            return _flashlightOn!!
        }
        _flashlightOn = Builder(name = "FlashlightOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(2.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(11.0f)
                lineToRelative(2.0f, -3.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(14.0f, 10.4f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-9.61f)
                lineToRelative(-2.0f, -3.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.39f)
                lineTo(14.0f, 10.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _flashlightOn!!
    }

private var _flashlightOn: ImageVector? = null
