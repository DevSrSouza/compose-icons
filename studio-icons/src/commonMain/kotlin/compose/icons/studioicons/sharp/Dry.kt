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

public val SharpGroup.Dry: ImageVector
    get() {
        if (_dry != null) {
            return _dry!!
        }
        _dry = Builder(name = "Dry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.68f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.86f)
                lineToRelative(1.88f, -3.3f)
                lineTo(9.12f, 5.0f)
                lineTo(1.0f, 12.68f)
                close()
                moveTo(15.65f, 4.86f)
                lineToRelative(-0.07f, -0.07f)
                curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.06f, 0.43f)
                curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                lineTo(14.98f, 9.0f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.06f, -0.43f)
                curveTo(17.16f, 7.21f, 16.68f, 5.86f, 15.65f, 4.86f)
                close()
                moveTo(19.65f, 4.86f)
                lineToRelative(-0.07f, -0.07f)
                curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.06f, 0.43f)
                curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                lineTo(18.98f, 9.0f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.06f, -0.43f)
                curveTo(21.16f, 7.21f, 20.68f, 5.86f, 19.65f, 4.86f)
                close()
            }
        }
        .build()
        return _dry!!
    }

private var _dry: ImageVector? = null
