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

public val OutlineGroup.Crib: ImageVector
    get() {
        if (_crib != null) {
            return _crib!!
        }
        _crib = Builder(name = "Crib", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.93f)
                curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(6.74f, 20.88f, 9.24f, 22.0f, 12.0f, 22.0f)
                curveToRelative(2.76f, 0.0f, 5.26f, -1.12f, 7.07f, -2.93f)
                lineToRelative(-1.42f, -1.42f)
                curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveTo(20.0f, 9.9f, 19.1f, 9.0f, 18.0f, 9.0f)
                close()
                moveTo(14.0f, 19.75f)
                curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(19.75f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _crib!!
    }

private var _crib: ImageVector? = null
