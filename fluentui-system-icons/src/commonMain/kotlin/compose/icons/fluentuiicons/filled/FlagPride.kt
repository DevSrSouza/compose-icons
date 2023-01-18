package compose.icons.fluentuiicons.filled

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
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FlagPride: ImageVector
    get() {
        if (_flagPride != null) {
            return _flagPride!!
        }
        _flagPride = Builder(name = "FlagPride", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF745125)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.25f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE62C46)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.75f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF36D38)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.25f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD23E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF61BC51)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1793E8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.25f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB73FBB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 3.0f)
                curveTo(3.3358f, 3.0f, 3.0f, 3.3358f, 3.0f, 3.75f)
                verticalLineTo(21.25f)
                curveTo(3.0f, 21.6642f, 3.3358f, 22.0f, 3.75f, 22.0f)
                curveTo(4.1642f, 22.0f, 4.5f, 21.6642f, 4.5f, 21.25f)
                lineTo(4.5f, 16.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 16.5f, 21.0f, 16.1642f, 21.0f, 15.75f)
                verticalLineTo(3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(4.5f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _flagPride!!
    }

private var _flagPride: ImageVector? = null
