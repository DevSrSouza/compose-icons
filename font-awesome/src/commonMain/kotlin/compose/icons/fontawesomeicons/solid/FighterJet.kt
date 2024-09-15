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

public val SolidGroup.FighterJet: ImageVector
    get() {
        if (_fighterJet != null) {
            return _fighterJet!!
        }
        _fighterJet = Builder(name = "FighterJet", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.0f, 224.0f)
                lineToRelative(-128.0f, -16.0f)
                lineToRelative(-48.0f, -16.0f)
                horizontalLineToRelative(-24.0f)
                lineTo(227.16f, 44.0f)
                horizontalLineToRelative(39.51f)
                curveTo(278.33f, 44.0f, 288.0f, 41.38f, 288.0f, 38.0f)
                reflectiveCurveToRelative(-9.67f, -6.0f, -21.33f, -6.0f)
                horizontalLineTo(152.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(164.0f)
                horizontalLineToRelative(-48.0f)
                lineToRelative(-66.67f, -80.0f)
                horizontalLineTo(18.67f)
                lineTo(8.0f, 138.67f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(2.67f)
                lineToRelative(-64.0f, 8.0f)
                verticalLineToRelative(42.67f)
                lineToRelative(64.0f, 8.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(69.33f)
                lineTo(18.67f, 384.0f)
                horizontalLineToRelative(34.67f)
                lineTo(120.0f, 304.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(164.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(114.67f)
                curveToRelative(11.67f, 0.0f, 21.33f, -2.63f, 21.33f, -6.0f)
                reflectiveCurveToRelative(-9.67f, -6.0f, -21.33f, -6.0f)
                horizontalLineToRelative(-39.51f)
                lineTo(344.0f, 320.0f)
                horizontalLineToRelative(24.0f)
                lineToRelative(48.0f, -16.0f)
                lineToRelative(128.0f, -16.0f)
                curveToRelative(96.0f, -21.33f, 96.0f, -26.58f, 96.0f, -32.0f)
                curveToRelative(0.0f, -5.42f, 0.0f, -10.67f, -96.0f, -32.0f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
