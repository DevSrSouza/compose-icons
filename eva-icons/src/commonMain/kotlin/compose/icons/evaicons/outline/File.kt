package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.74f, 8.33f)
                lineToRelative(-5.44f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.56f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 6.56f, 22.0f)
                lineTo(17.44f, 22.0f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 20.0f, 19.5f)
                lineTo(20.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.74f, 8.33f)
                close()
                moveTo(17.65f, 9.0f)
                lineTo(13.71f, 9.0f)
                arcTo(0.79f, 0.79f, 0.0f, false, true, 13.0f, 8.15f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(0.11f)
                close()
                moveTo(17.44f, 20.0f)
                lineTo(6.56f, 20.0f)
                arcTo(0.53f, 0.53f, 0.0f, false, true, 6.0f, 19.5f)
                lineTo(6.0f, 4.5f)
                arcTo(0.53f, 0.53f, 0.0f, false, true, 6.56f, 4.0f)
                lineTo(11.0f, 4.0f)
                lineTo(11.0f, 8.15f)
                arcTo(2.79f, 2.79f, 0.0f, false, false, 13.71f, 11.0f)
                lineTo(18.0f, 11.0f)
                verticalLineToRelative(8.5f)
                arcTo(0.53f, 0.53f, 0.0f, false, true, 17.44f, 20.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
