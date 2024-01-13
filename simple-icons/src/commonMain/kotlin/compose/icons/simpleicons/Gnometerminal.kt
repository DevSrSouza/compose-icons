package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Gnometerminal: ImageVector
    get() {
        if (_gnometerminal != null) {
            return _gnometerminal!!
        }
        _gnometerminal = Builder(name = "Gnometerminal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.846f, 0.0f)
                arcTo(1.841f, 1.841f, 0.0f, false, false, 0.0f, 1.846f)
                verticalLineToRelative(18.463f)
                curveToRelative(0.0f, 1.022f, 0.823f, 1.845f, 1.846f, 1.845f)
                horizontalLineToRelative(20.308f)
                arcTo(1.841f, 1.841f, 0.0f, false, false, 24.0f, 20.31f)
                lineTo(24.0f, 1.846f)
                arcTo(1.841f, 1.841f, 0.0f, false, false, 22.154f, 0.0f)
                lineTo(1.846f, 0.0f)
                close()
                moveTo(1.846f, 0.924f)
                horizontalLineToRelative(20.308f)
                curveToRelative(0.512f, 0.0f, 0.922f, 0.41f, 0.922f, 0.922f)
                verticalLineToRelative(18.463f)
                curveToRelative(0.0f, 0.511f, -0.41f, 0.921f, -0.922f, 0.921f)
                lineTo(1.846f, 21.23f)
                arcToRelative(0.919f, 0.919f, 0.0f, false, true, -0.922f, -0.921f)
                lineTo(0.924f, 1.846f)
                curveToRelative(0.0f, -0.512f, 0.41f, -0.922f, 0.922f, -0.922f)
                close()
                moveTo(1.846f, 1.846f)
                verticalLineToRelative(18.463f)
                horizontalLineToRelative(20.308f)
                lineTo(22.154f, 1.846f)
                lineTo(1.846f, 1.846f)
                close()
                moveTo(3.691f, 3.986f)
                lineToRelative(3.235f, 1.758f)
                verticalLineToRelative(0.836f)
                lineTo(3.69f, 8.477f)
                lineTo(3.69f, 7.385f)
                lineToRelative(2.243f, -1.207f)
                verticalLineToRelative(-0.033f)
                lineTo(3.69f, 5.076f)
                verticalLineToRelative(-1.09f)
                close()
                moveTo(7.846f, 9.23f)
                horizontalLineToRelative(3.693f)
                verticalLineToRelative(0.924f)
                lineTo(7.846f, 10.154f)
                lineTo(7.846f, 9.23f)
                close()
                moveTo(0.0f, 21.736f)
                verticalLineToRelative(0.418f)
                curveTo(0.0f, 23.177f, 0.823f, 24.0f, 1.846f, 24.0f)
                horizontalLineToRelative(20.308f)
                arcTo(1.841f, 1.841f, 0.0f, false, false, 24.0f, 22.154f)
                verticalLineToRelative(-0.418f)
                arcToRelative(2.334f, 2.334f, 0.0f, false, true, -1.846f, 0.918f)
                lineTo(1.846f, 22.654f)
                arcTo(2.334f, 2.334f, 0.0f, false, true, 0.0f, 21.736f)
                close()
            }
        }
        .build()
        return _gnometerminal!!
    }

private var _gnometerminal: ImageVector? = null
