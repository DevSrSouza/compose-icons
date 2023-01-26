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

public val OutlineGroup.KingBed: ImageVector
    get() {
        if (_kingBed != null) {
            return _kingBed!!
        }
        _kingBed = Builder(name = "KingBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.33f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.67f, -2.0f)
                horizontalLineToRelative(12.67f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.67f, -2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _kingBed!!
    }

private var _kingBed: ImageVector? = null