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

public val SimpleIcons.Borgbackup: ImageVector
    get() {
        if (_borgbackup != null) {
            return _borgbackup!!
        }
        _borgbackup = Builder(name = "Borgbackup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.144f)
                verticalLineToRelative(6.023f)
                horizontalLineToRelative(2.006f)
                lineTo(2.006f, 8.144f)
                close()
                moveTo(2.324f, 8.144f)
                verticalLineToRelative(1.203f)
                horizontalLineToRelative(1.488f)
                verticalLineToRelative(1.285f)
                lineTo(2.324f, 10.632f)
                verticalLineToRelative(1.048f)
                horizontalLineToRelative(1.488f)
                verticalLineToRelative(1.284f)
                lineTo(2.324f, 12.964f)
                verticalLineToRelative(1.203f)
                horizontalLineToRelative(2.328f)
                lineToRelative(1.207f, -1.203f)
                lineTo(5.859f, 11.78f)
                lineToRelative(-0.603f, -0.604f)
                lineToRelative(0.603f, -0.603f)
                lineTo(5.859f, 9.347f)
                lineTo(4.652f, 8.144f)
                close()
                moveTo(7.893f, 9.347f)
                lineTo(6.69f, 10.55f)
                verticalLineToRelative(2.414f)
                lineToRelative(1.203f, 1.203f)
                lineTo(9.24f, 14.167f)
                verticalLineToRelative(-1.125f)
                horizontalLineToRelative(-0.522f)
                lineTo(8.718f, 10.55f)
                horizontalLineToRelative(0.522f)
                lineTo(9.24f, 9.347f)
                close()
                moveTo(9.558f, 9.347f)
                verticalLineToRelative(1.203f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.492f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.125f)
                horizontalLineToRelative(1.344f)
                lineToRelative(1.202f, -1.203f)
                lineTo(12.104f, 10.55f)
                lineToRelative(-1.202f, -1.203f)
                close()
                moveTo(13.012f, 9.347f)
                verticalLineToRelative(4.82f)
                horizontalLineToRelative(2.006f)
                verticalLineToRelative(-4.82f)
                close()
                moveTo(16.012f, 9.347f)
                lineTo(15.34f, 10.023f)
                verticalLineToRelative(0.527f)
                horizontalLineToRelative(0.854f)
                verticalLineToRelative(1.171f)
                horizontalLineToRelative(2.01f)
                verticalLineToRelative(-1.248f)
                lineToRelative(-0.975f, -1.126f)
                close()
                moveTo(19.983f, 9.347f)
                lineTo(18.781f, 10.55f)
                verticalLineToRelative(2.414f)
                lineToRelative(1.202f, 1.203f)
                horizontalLineToRelative(1.094f)
                lineToRelative(0.6f, -0.594f)
                verticalLineToRelative(-0.531f)
                horizontalLineToRelative(-0.89f)
                lineTo(20.787f, 9.347f)
                close()
                moveTo(21.104f, 9.347f)
                verticalLineToRelative(1.203f)
                horizontalLineToRelative(0.89f)
                verticalLineToRelative(4.253f)
                horizontalLineToRelative(-2.446f)
                verticalLineToRelative(0.444f)
                lineToRelative(0.603f, 0.609f)
                horizontalLineToRelative(2.646f)
                lineTo(24.0f, 14.644f)
                lineTo(24.0f, 10.55f)
                lineToRelative(-1.203f, -1.203f)
                close()
            }
        }
        .build()
        return _borgbackup!!
    }

private var _borgbackup: ImageVector? = null
