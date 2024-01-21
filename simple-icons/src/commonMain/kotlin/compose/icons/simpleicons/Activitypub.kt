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

public val SimpleIcons.Activitypub: ImageVector
    get() {
        if (_activitypub != null) {
            return _activitypub!!
        }
        _activitypub = Builder(name = "Activitypub", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.91f, 4.442f)
                lineTo(0.0f, 10.74f)
                verticalLineToRelative(2.52f)
                lineTo(8.727f, 8.22f)
                verticalLineToRelative(10.077f)
                lineToRelative(2.182f, 1.26f)
                close()
                moveTo(6.545f, 12.0f)
                lineToRelative(-4.364f, 2.52f)
                lineToRelative(4.364f, 2.518f)
                close()
                moveTo(13.09f, 9.48f)
                lineTo(17.455f, 12.0f)
                lineToRelative(-4.364f, 2.52f)
                close()
                moveTo(13.09f, 4.442f)
                lineTo(24.0f, 10.74f)
                verticalLineToRelative(2.52f)
                lineToRelative(-10.91f, 6.298f)
                verticalLineToRelative(-2.52f)
                lineTo(21.819f, 12.0f)
                lineTo(13.091f, 6.96f)
                close()
            }
        }
        .build()
        return _activitypub!!
    }

private var _activitypub: ImageVector? = null
