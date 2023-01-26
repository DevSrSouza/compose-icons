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

public val OutlineGroup.TempleHindu: ImageVector
    get() {
        if (_templeHindu != null) {
            return _templeHindu!!
        }
        _templeHindu = Builder(name = "TempleHindu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.03f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.12f)
                lineTo(6.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(15.31f, 11.0f)
                horizontalLineTo(8.69f)
                lineToRelative(0.6f, -2.0f)
                horizontalLineToRelative(5.42f)
                lineTo(15.31f, 11.0f)
                close()
                moveTo(14.11f, 7.0f)
                horizontalLineTo(9.89f)
                lineToRelative(0.6f, -2.0f)
                horizontalLineToRelative(3.02f)
                lineTo(14.11f, 7.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.49f)
                lineToRelative(0.6f, -2.0f)
                horizontalLineToRelative(7.82f)
                lineToRelative(0.6f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _templeHindu!!
    }

private var _templeHindu: ImageVector? = null
