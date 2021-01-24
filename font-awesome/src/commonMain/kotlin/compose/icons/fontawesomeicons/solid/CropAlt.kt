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

public val SolidGroup.CropAlt: ImageVector
    get() {
        if (_cropAlt != null) {
            return _cropAlt!!
        }
        _cropAlt = Builder(name = "CropAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.0f, 352.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(328.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(160.0f, 24.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(88.0f)
                curveTo(74.75f, 0.0f, 64.0f, 10.74f, 64.0f, 24.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 64.0f, 0.0f, 74.74f, 0.0f, 88.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(224.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _cropAlt!!
    }

private var _cropAlt: ImageVector? = null
