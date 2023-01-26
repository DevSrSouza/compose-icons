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

public val SharpGroup.Liquor: ImageVector
    get() {
        if (_liquor != null) {
            return _liquor!!
        }
        _liquor = Builder(name = "Liquor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-3.18f)
                curveTo(8.16f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                lineToRelative(-3.0f, -1.01f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-3.0f, 1.01f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 10.44f)
                lineToRelative(3.0f, -0.98f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.46f)
                lineToRelative(3.0f, 0.98f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(10.44f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _liquor!!
    }

private var _liquor: ImageVector? = null