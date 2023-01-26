package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.OfflineShare: ImageVector
    get() {
        if (_offlineShare != null) {
            return _offlineShare!!
        }
        _offlineShare = Builder(name = "OfflineShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 18.0f)
                lineToRelative(12.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-10.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 10.25f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 1.75f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(0.0f, 1.75f)
                lineToRelative(-3.5f, 0.0f)
                lineToRelative(0.0f, 3.25f)
                lineToRelative(1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _offlineShare!!
    }

private var _offlineShare: ImageVector? = null
