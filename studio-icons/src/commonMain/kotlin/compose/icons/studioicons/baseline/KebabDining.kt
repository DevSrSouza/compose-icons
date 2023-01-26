package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.KebabDining: ImageVector
    get() {
        if (_kebabDining != null) {
            return _kebabDining!!
        }
        _kebabDining = Builder(name = "KebabDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(5.5f)
                curveTo(4.12f, 19.0f, 3.0f, 17.88f, 3.0f, 16.5f)
                curveTo(3.0f, 15.12f, 4.12f, 14.0f, 5.5f, 14.0f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.5f)
                curveTo(4.12f, 7.0f, 3.0f, 5.88f, 3.0f, 4.5f)
                curveTo(3.0f, 3.12f, 4.12f, 2.0f, 5.5f, 2.0f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.5f)
                curveTo(9.88f, 2.0f, 11.0f, 3.12f, 11.0f, 4.5f)
                curveTo(11.0f, 5.88f, 9.88f, 7.0f, 8.5f, 7.0f)
                horizontalLineTo(7.75f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.75f, 7.0f)
                horizontalLineToRelative(0.75f)
                curveTo(19.88f, 7.0f, 21.0f, 5.88f, 21.0f, 4.5f)
                curveTo(21.0f, 3.12f, 19.88f, 2.0f, 18.5f, 2.0f)
                horizontalLineToRelative(-0.75f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(15.5f)
                curveTo(14.12f, 2.0f, 13.0f, 3.12f, 13.0f, 4.5f)
                curveTo(13.0f, 5.88f, 14.12f, 7.0f, 15.5f, 7.0f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(15.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _kebabDining!!
    }

private var _kebabDining: ImageVector? = null
