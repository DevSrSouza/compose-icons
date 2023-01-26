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

public val OutlineGroup.BookOnline: ImageVector
    get() {
        if (_bookOnline != null) {
            return _bookOnline!!
        }
        _bookOnline = Builder(name = "BookOnline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(17.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f)
                lineTo(17.0f, 1.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.0f, 11.0f)
                verticalLineTo(9.14f)
                curveTo(16.0f, 8.51f, 15.55f, 8.0f, 15.0f, 8.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 8.0f, 8.0f, 8.51f, 8.0f, 9.14f)
                lineToRelative(0.0f, 1.96f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineToRelative(0.0f, 1.76f)
                curveTo(8.0f, 15.49f, 8.45f, 16.0f, 9.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.51f, 1.0f, -1.14f)
                verticalLineTo(13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(15.0f, 11.45f, 15.45f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(12.5f, 14.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.5f, 12.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(12.5f)
                close()
                moveTo(12.5f, 10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _bookOnline!!
    }

private var _bookOnline: ImageVector? = null
