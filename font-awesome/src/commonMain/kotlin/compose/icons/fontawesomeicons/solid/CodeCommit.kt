package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CodeCommit: ImageVector
    get() {
        if (_codeCommit != null) {
            return _codeCommit!!
        }
        _codeCommit = Builder(name = "CodeCommit", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 336.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
                moveTo(476.8f, 288.0f)
                curveTo(462.0f, 361.0f, 397.4f, 416.0f, 320.0f, 416.0f)
                reflectiveCurveToRelative(-142.0f, -55.0f, -156.8f, -128.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(163.2f, 224.0f)
                curveTo(178.0f, 151.0f, 242.6f, 96.0f, 320.0f, 96.0f)
                reflectiveCurveToRelative(142.0f, 55.0f, 156.8f, 128.0f)
                lineTo(608.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(476.8f, 288.0f)
                close()
            }
        }
        .build()
        return _codeCommit!!
    }

private var _codeCommit: ImageVector? = null
