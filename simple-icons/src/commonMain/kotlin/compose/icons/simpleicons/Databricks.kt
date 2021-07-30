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

public val SimpleIcons.Databricks: ImageVector
    get() {
        if (_databricks != null) {
            return _databricks!!
        }
        _databricks = Builder(name = "Databricks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.95f, 14.184f)
                lineTo(12.0f, 20.403f)
                lineToRelative(9.919f, -5.55f)
                verticalLineToRelative(2.21f)
                lineTo(12.0f, 22.662f)
                lineToRelative(-10.484f, -5.96f)
                lineToRelative(-0.565f, 0.308f)
                verticalLineToRelative(0.77f)
                lineTo(12.0f, 24.0f)
                lineToRelative(11.05f, -6.218f)
                verticalLineToRelative(-4.317f)
                lineToRelative(-0.515f, -0.309f)
                lineTo(12.0f, 19.118f)
                lineToRelative(-9.867f, -5.653f)
                verticalLineToRelative(-2.21f)
                lineTo(12.0f, 16.805f)
                lineToRelative(11.05f, -6.218f)
                verticalLineTo(6.32f)
                lineToRelative(-0.515f, -0.308f)
                lineTo(12.0f, 11.974f)
                lineTo(2.647f, 6.681f)
                lineTo(12.0f, 1.388f)
                lineToRelative(7.76f, 4.368f)
                lineToRelative(0.668f, -0.411f)
                verticalLineToRelative(-0.566f)
                lineTo(12.0f, 0.0f)
                lineTo(0.95f, 6.27f)
                verticalLineToRelative(0.72f)
                lineTo(12.0f, 13.207f)
                lineToRelative(9.919f, -5.55f)
                verticalLineToRelative(2.26f)
                lineTo(12.0f, 15.52f)
                lineTo(1.516f, 9.56f)
                lineToRelative(-0.565f, 0.308f)
                close()
            }
        }
        .build()
        return _databricks!!
    }

private var _databricks: ImageVector? = null
