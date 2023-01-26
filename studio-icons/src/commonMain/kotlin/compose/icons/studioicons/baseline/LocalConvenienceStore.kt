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

public val BaselineGroup.LocalConvenienceStore: ImageVector
    get() {
        if (_localConvenienceStore != null) {
            return _localConvenienceStore!!
        }
        _localConvenienceStore = Builder(name = "LocalConvenienceStore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _localConvenienceStore!!
    }

private var _localConvenienceStore: ImageVector? = null
