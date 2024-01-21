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

public val SolidGroup.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(120.0f, 383.0f)
                curveToRelative(-13.8f, -3.6f, -24.0f, -16.1f, -24.0f, -31.0f)
                verticalLineTo(296.9f)
                lineToRelative(-4.6f, 7.6f)
                curveToRelative(-9.1f, 15.1f, -28.8f, 20.0f, -43.9f, 10.9f)
                reflectiveCurveToRelative(-20.0f, -28.8f, -10.9f, -43.9f)
                lineToRelative(58.3f, -97.0f)
                curveToRelative(15.0f, -24.9f, 40.3f, -41.5f, 68.7f, -45.6f)
                curveToRelative(4.1f, -0.6f, 8.2f, -1.0f, 12.5f, -1.0f)
                horizontalLineToRelative(1.1f)
                horizontalLineToRelative(12.5f)
                horizontalLineTo(192.0f)
                curveToRelative(1.4f, 0.0f, 2.8f, 0.1f, 4.1f, 0.3f)
                curveToRelative(35.7f, 2.9f, 65.4f, 29.3f, 72.1f, 65.0f)
                lineToRelative(6.1f, 32.5f)
                curveToRelative(44.3f, 8.6f, 77.7f, 47.5f, 77.7f, 94.3f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(304.0f)
                horizontalLineTo(264.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(383.0f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
