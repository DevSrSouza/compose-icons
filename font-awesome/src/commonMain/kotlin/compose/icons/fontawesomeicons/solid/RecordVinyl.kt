package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RecordVinyl: ImageVector
    get() {
        if (_recordVinyl != null) {
            return _recordVinyl!!
        }
        _recordVinyl = Builder(name = "RecordVinyl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 152.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 104.0f, 104.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -104.0f, -104.0f)
                close()
                moveTo(256.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                close()
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 384.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 128.0f, -128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, true, -128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _recordVinyl!!
    }

private var _recordVinyl: ImageVector? = null
