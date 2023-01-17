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

public val SimpleIcons.Clickhouse: ImageVector
    get() {
        if (_clickhouse != null) {
            return _clickhouse!!
        }
        _clickhouse = Builder(name = "Clickhouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.333f, 10.0f)
                lineTo(24.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.667f)
                close()
                moveTo(16.0f, 1.335f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(21.33f)
                lineTo(16.0f, 22.665f)
                close()
                moveTo(10.667f, 1.335f)
                horizontalLineToRelative(2.666f)
                verticalLineToRelative(21.33f)
                horizontalLineToRelative(-2.666f)
                close()
                moveTo(0.0f, 22.665f)
                lineTo(0.0f, 1.335f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(21.33f)
                close()
                moveTo(5.333f, 1.335f)
                lineTo(8.0f, 1.335f)
                verticalLineToRelative(21.33f)
                lineTo(5.333f, 22.665f)
                close()
            }
        }
        .build()
        return _clickhouse!!
    }

private var _clickhouse: ImageVector? = null
